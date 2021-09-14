![](https://github.com/ocpjp-study/local-variable-inference/blob/main/ocpjp.png)

[Preparação para o Exame 1Z0-817](https://education.oracle.com/pt_BR/upgrade-ocp-java-6-7-8-to-java-se-11-developer/pexam_1Z0-817)

### Tópico: Expressões Lambda

### Objetivos
- Criar e usar expressões lambda
- Usar expressões lambda em ‘variável local’ nos parâmetros
- Usar interface funcional, incluindo: Predicate, Consumer, Function e Supplier
- Usar variações primitivas e binárias do pacote java.util.function

### Regras
- Quando usar `var`, deverá usar para todos os parâmetros;
- O tipo reservado `var`, poderá ser usado como nome de variável;
- Uma variável usada em uma expressão lambda, deverá sempre ser final ou efetivamente final;
- A expressão `efetivamente final`, refere-se somente a variável local;
- Quando for declarar um tipo para o nome de algum parâmetro, então deverá declarar para todos os parâmetros;
- Quando for declarar um corpo com chaves, então deverá usar um `return`;
- Um método default pode ser declarado como public;
- Um método private pode ser declarado como static; 
- Quando uma classe ou interface implements/extends outras 2 ou mais interfaces que tenham o mesmo método default, então esse deverá ser subscrito. Caso contrário, não irá compilar;
- Para chamar um método default, deverá: `Interface.super.metodoDesejado()`;
- Vantagem de usar o método `default`:
     - Compatibilidade com versões anteriores;
     - Conveniência em classes implementando a interface;

### java.uti.function
```java
/**
*  Interface usada para gerar algo, sem passar parâmetros. É frequentemente usada, para construir novos objetos.
*/
@FunctionalInterface
public interface Supplier<T> {
     T get();
}
```

```java
/**
*  Interface usada para fazer algo, recebendo um parâmetro. Sem retorno (void).
*/
@FunctionalInterface
public interface Consumer<T> {
    void accept(T t);
    default Consumer<T> andThen(Consumer<? super T> after) {...}
}
```

```java
/**
*  Interface usada para fazer algo, recebendo 2 parâmetros. Sem retorno (void).
*/
@FunctionalInterface
public interface BiConsumer<T> {
    void accept(T t, U u);
    default BiConsumer<T, U> andThen(BiConsumer<? super T, ? super U> after) {...}
}
```

```java
/**
*  Interface que recebe 1 parâmetro, e realiza um teste.
*/
@FunctionalInterface
public interface Predicate<T> {
    boolean test(T t);
    default Predicate<T> and(Predicate<? super T> other) {...}
    default Predicate<T> negate() {...}
    default Predicate<T> or(Predicate<? super T> other){...}
    static <T> Predicate<T> isEqual(Object targetRef) {...}
    static <T> Predicate<T> not(Predicate<? super T> target){...}
}
```

```java
/**
*  Interface que recebe 2 parâmetros, e realiza um teste.
*/
@FunctionalInterface
public interface BiPredicate<T, U> {
    boolean test(T t, U u);
    default BiPredicate<T, U> and(BiPredicate<? super T, ? super U> other) {...}
    default BiPredicate<T, U> negate() {...}
    default BiPredicate<T, U> or(BiPredicate<? super T, ? super U> other) {...}
}
```

```java
/**
*  Interface que recebe 1 parâmetro e produz um resultado.
*/
@FunctionalInterface
public interface Function<T, R> {
    R apply(T t);
    default <V> Function<V, R> compose(Function<? super V, ? extends T> before) {...}
    default <V> Function<T, V> andThen(Function<? super R, ? extends V> after) {...}
    static <T> Function<T, T> identity() {...}
}
```

```java
/**
*  Interface que recebe 2 parâmetros e produz um resultado.
*/
@FunctionalInterface
public interface BiFunction<T, U, R> {
    R apply(T t, U u);
    default <V> BiFunction<T, U, V> andThen(Function<? super R, ? extends V> after) {...}
}    
```

```java
/**
*  Interface que recebe 1 parâmetro e produz um resultado. Retorna o mesmo tipo do input.
*/
@FunctionalInterface
public interface UnaryOperator<T> extends Function<T, T> {
     static <T> UnaryOperator<T> identity(){...}
} 
```

```java
/**
*  Interface que recebe 2 parâmetros e produz um resultado. Retorna o mesmo tipo do input.
*/
@FunctionalInterface
public interface BinaryOperator<T> extends BiFunction<T,T,T> {
     public static <T> BinaryOperator<T> minBy(Comparator<? super T> comparator) {...}
     public static <T> BinaryOperator<T> maxBy(Comparator<? super T> comparator) {...}
}
```

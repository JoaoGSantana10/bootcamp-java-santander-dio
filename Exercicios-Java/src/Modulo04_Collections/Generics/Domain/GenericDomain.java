package Modulo04_Collections.Generics.Domain;

public interface GenericDomain<T> {

    T getId();

    void setId(T id);

    /*

    Trabalhando com class

    private T id;

    public GenericDomain() {
    }

    public GenericDomain(T id) {
        this.id = id;
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        GenericDomain<?> that = (GenericDomain<?>) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "GenericDomain{" +
                "id=" + id +
                '}';
    }
    */
}

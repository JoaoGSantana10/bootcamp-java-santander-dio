package Modulo03.Interfaces.Exercicio_Interfaces.Fórmula_Geométrica;

public record Square(double side) implements GeometricForm {
    @Override
    public double getArea() {
        return side * side;
    }
}

package one.digitalinnovation.basecamp;

public class CalcularArea {
    public double resultado;

    public double quadrilateros(double lado){
        resultado = (lado * lado);
        return resultado;
    }

    public double quadrilateros(double baseMaior, double baseMenor){
        resultado = (baseMaior * baseMenor);
        return resultado;
    }

    public double quadrilateros(double baseMaior, double baseMenor, double altura){
        resultado = (((baseMaior * baseMenor) * altura) / 2);
        return resultado;
    }
}

package com.example.numeros;

public class NumeroService {

    public Integer obtenerTotal(Integer n) {


        Integer contador= 0;
        for (Integer i = 1; i <=n ; i++) {
            if (!ContieneNumero(i)){
                contador++;
            }
        }
        return  contador;
    }
    private boolean ContieneNumero(Integer n) {
        String numeroStr = String.valueOf(n);
        return numeroStr.contains("13");
    }
}

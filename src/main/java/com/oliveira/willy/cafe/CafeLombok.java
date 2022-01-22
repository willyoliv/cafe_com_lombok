package com.oliveira.willy.cafe;

import lombok.*;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

@Data
// cria um construtor com todos os atributos como parâmetro
@AllArgsConstructor
//cria um construtor com para os campos finais
//@RequiredArgsConstructor
//cria um construtor sem parâmetros
//@NoArgsConstructor
@Builder
public class CafeLombok implements ICafe{
    @Setter
    @Getter
    private String sabor;

    @Getter
    private String safra;

    @Setter
    private String aroma;

    @Override
    public void imprimirCardapio(String sabor, String safra) throws FileNotFoundException, UnsupportedEncodingException {
        @Cleanup PrintWriter writer = new PrintWriter("cardapio-cafe-lombok.txt", "UTF-8");
        writer.println("CARDÁPIO LET'S CODE");
        writer.println("Sabor: " + sabor + " e safra: " + safra);
    }
}

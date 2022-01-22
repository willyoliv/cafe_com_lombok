import com.oliveira.willy.cafe.Cafe;
import com.oliveira.willy.cafe.CafeLombok;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

public class CafeApplication {
    public static void main(String[] args) {
        //Instância sem utilizar o lombok
        Cafe cafe = new Cafe("Café", "2022","Aroma bom");
        System.out.println("Café sem Lombok: " + cafe.toString());
        cafe.imprimirCardapio(cafe.getSabor(), cafe.getSafra());

        //Instância utilizando o lombok
        CafeLombok cafeLombok = new CafeLombok("Café", "2022","Aroma bom");
        System.out.println("Café com Lombok: " + cafeLombok.toString());

        //Instância utilizando @Builder
        CafeLombok cafeBuilder = CafeLombok.builder()
                .sabor("Café")
                .safra("2022")
                .aroma("Aroma bom")
                .build();
        System.out.println("Café com Builder: " + cafeBuilder.toString());
        try {
            cafeBuilder.imprimirCardapio(cafeBuilder.getSabor(), cafeBuilder.getSafra());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}

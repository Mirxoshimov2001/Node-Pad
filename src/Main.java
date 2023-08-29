import NodePad.JFrameText;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        try{
            new JFrameText();
            System.out.println("Xatolik aniqlanmadi. Dastur ishga tushdi!");
        }catch (Exception e){
            System.out.println("Xatolik Aniqlandi!");
            System.out.println(e.getMessage());
        }


    }
}
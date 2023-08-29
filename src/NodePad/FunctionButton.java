package NodePad;



import java.awt.Color;
import java.awt.FileDialog;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FunctionButton {
    JFrameText jFrameText;
    String fileName;
    String filePath;

    public FunctionButton(JFrameText jf) {
        fileName = null;
        filePath = null;
        this.jFrameText = jf;
    }

    public void clear() {
        this.jFrameText.textArea.setText("");
    }

    public void clear(String name) {
        this.jFrameText.textArea.setText("");
        this.jFrameText.window.setTitle(name);
    }

    public void open() {
        FileDialog dialog = new FileDialog(this.jFrameText.window, "Open", 0);
        dialog.setVisible(true);
        if (dialog.getFile() != null) {
            this.fileName = dialog.getFile();
            this.filePath = dialog.getDirectory();
            this.jFrameText.window.setTitle(this.fileName);
        }

        try {
            BufferedReader reader = new BufferedReader(new FileReader(this.filePath + this.fileName));
            this.jFrameText.textArea.setText("");
            String line = null;
            while((line = reader.readLine()) != null) {
                this.jFrameText.textArea.append(line + '\n');
            }

            reader.close();
        } catch (Exception e) {
            System.out.println("FILE NOT OPENED");
            System.out.println(e.getMessage());
        }

    }

    public void save() {

        if (this.fileName != null) {
            this.writeFile();
            System.out.println("Aniqlangan faylga maluot qayta yozildi!");
        } else {
            FileDialog dialog = new FileDialog(this.jFrameText.window, "Save", 1);
            System.out.println("Aniqlangan fayl mavjud emas!");
            dialog.setVisible(true);
            if (dialog.getFile() != null) {
                this.fileName = dialog.getFile();
                this.filePath = dialog.getDirectory();
                this.jFrameText.window.setTitle(this.fileName);
                this.writeFile();
            }else {
            System.out.println("Fayl aniqlanmagan va malumot yozilmadi!");}
        }

    }

    public void writeFile() {
        try {
            FileWriter writer = new FileWriter(this.filePath + this.fileName);
            writer.write(this.jFrameText.textArea.getText());
            writer.close();
        } catch (IOException var2) {
            throw new RuntimeException(var2);
        }
    }

    public void New() {
        this.save();
        this.filePath = null;
        this.fileName = null;
        this.clear("New Page");
    }

    public void exit() {
        this.save();
        this.jFrameText.window.setVisible(false);
    }

    public void changeTextColor(String color) {
        switch (color) {
            case "blue":
                this.jFrameText.textArea.setForeground(Color.BLUE);
                break;
            case "black":
                this.jFrameText.textArea.setForeground(Color.BLACK);
                break;
            case "white":
                this.jFrameText.textArea.setForeground(Color.WHITE);
                break;
            case "green":
                this.jFrameText.textArea.setForeground(Color.GREEN);
        }

    }

    public void changeBgColor(String color) {
        switch (color) {
            case "blue":
                this.jFrameText.textArea.setBackground(Color.BLUE);
                break;
            case "black":
                this.jFrameText.textArea.setBackground(Color.BLACK);
                break;
            case "white":
                this.jFrameText.textArea.setBackground(Color.WHITE);
                break;
            case "green":
                this.jFrameText.textArea.setBackground(Color.GREEN);
        }

    }

    public void changeFontSize(float size) {
        this.jFrameText.textArea.setFont(this.jFrameText.textArea.getFont().deriveFont(size));
    }

    public void changeFontStyle(int style) {
        this.jFrameText.textArea.setFont(this.jFrameText.textArea.getFont().deriveFont(style));
    }
}


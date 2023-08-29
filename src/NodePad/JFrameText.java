package NodePad;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class JFrameText implements ActionListener {
    JFrame window;
    JTextArea textArea;
    JScrollPane scrollPane;
    JMenuBar menuBar;
    JMenu file;
    JMenu veiw;
    JMenu format;
    JMenu textColor;
    JMenu BgColor;
    JMenu font;
    JMenu fontSize;
    JMenuItem New;
    JMenuItem open;
    JMenuItem save;
    JMenuItem clear;
    JMenuItem exit;
    JMenuItem blue;
    JMenuItem black;
    JMenuItem white;
    JMenuItem green;
    JMenuItem blueB;
    JMenuItem blackB;
    JMenuItem whiteB;
    JMenuItem greenB;
    JMenuItem bold;
    JMenuItem italic;
    JMenuItem F22;
    JMenuItem F14;
    JMenuItem F16;
    JMenuItem F36;
    FunctionButton functionButton = new FunctionButton(this);

    public JFrameText() {
        this.createWindov();
        this.TextAreaAdd();
        this.createMenu();
        this.window.setVisible(true);
    }

    public void createWindov() {
        this.window = new JFrame("Write Window");
        this.window.setSize(800, 600);
        this.window.setDefaultCloseOperation(3);
    }

    public void TextAreaAdd() {
        this.textArea = new JTextArea();
        this.scrollPane = new JScrollPane(this.textArea, 20, 30);
        this.scrollPane.setBorder(BorderFactory.createEmptyBorder());
        this.window.add(this.scrollPane);
    }

    public void createMenu() {
        this.menuBar = new JMenuBar();
        this.createFileMenu();
        this.menuBar.add(this.file);
        this.createVeiw();
        this.menuBar.add(this.veiw);
        this.createFormat();
        this.menuBar.add(this.format);
        this.window.setJMenuBar(this.menuBar);
    }

    public void createFileMenu() {
        this.file = new JMenu("File");
        this.New = new JMenuItem("New");
        this.New.addActionListener(this);
        this.New.setActionCommand("new");
        this.file.add(this.New);
        this.save = new JMenuItem("Save");
        this.save.addActionListener(this);
        this.save.setActionCommand("save");
        this.file.add(this.save);
        this.open = new JMenuItem("Open");
        this.open.addActionListener(this);
        this.open.setActionCommand("open");
        this.file.add(this.open);
        this.clear = new JMenuItem("Clear");
        this.clear.addActionListener(this);
        this.clear.setActionCommand("clear");
        this.file.add(this.clear);
        this.exit = new JMenuItem("Exite");
        this.exit.addActionListener(this);
        this.exit.setActionCommand("exit");
        this.file.add(this.exit);
    }

    public void createVeiw() {
        this.veiw = new JMenu("Veiw");
        this.createTextColor();
        this.veiw.add(this.textColor);
        this.CreateBgColor();
        this.veiw.add(this.BgColor);
    }

    public void createFormat() {
        this.format = new JMenu("Format");
        this.changeFont();
        this.format.add(this.font);
        this.changeFontSize();
        this.format.add(this.fontSize);
    }

    public void createTextColor() {
        this.textColor = new JMenu("Text Color");
        this.black = new JMenuItem("Black");
        this.black.addActionListener(this);
        this.black.setActionCommand("blackT");
        this.textColor.add(this.black);
        this.blue = new JMenuItem("Blue");
        this.blue.addActionListener(this);
        this.blue.setActionCommand("blueT");
        this.textColor.add(this.blue);
        this.white = new JMenuItem("White");
        this.white.addActionListener(this);
        this.white.setActionCommand("whiteT");
        this.textColor.add(this.white);
        this.green = new JMenuItem("Green");
        this.green.addActionListener(this);
        this.green.setActionCommand("greenT");
        this.textColor.add(this.green);
    }

    public void CreateBgColor() {
        this.BgColor = new JMenu("Background Color");
        this.blackB = new JMenuItem("Brack");
        this.blackB.addActionListener(this);
        this.blackB.setActionCommand("blackB");
        this.BgColor.add(this.blackB);
        this.blueB = new JMenuItem("Blue");
        this.blueB.addActionListener(this);
        this.blueB.setActionCommand("blueB");
        this.BgColor.add(this.blueB);
        this.whiteB = new JMenuItem("White");
        this.whiteB.addActionListener(this);
        this.whiteB.setActionCommand("whiteB");
        this.BgColor.add(this.whiteB);
        this.greenB = new JMenuItem("Green");
        this.greenB.addActionListener(this);
        this.greenB.setActionCommand("greenB");
        this.BgColor.add(this.greenB);
    }

    public void changeFont() {
        this.font = new JMenu("Font Style");
        this.bold = new JMenuItem("Bold");
        this.bold.addActionListener(this);
        this.bold.setActionCommand("bold");
        this.font.add(this.bold);
        this.italic = new JMenuItem("Italic");
        this.italic.addActionListener(this);
        this.italic.setActionCommand("italic");
        this.font.add(this.italic);
    }

    public void changeFontSize() {
        this.fontSize = new JMenu("Font Size");
        this.F14 = new JMenuItem("14");
        this.F14.addActionListener(this);
        this.F14.setActionCommand("14");
        this.fontSize.add(this.F14);
        this.F16 = new JMenuItem("16");
        this.F16.addActionListener(this);
        this.F16.setActionCommand("16");
        this.fontSize.add(this.F16);
        this.F22 = new JMenuItem("22");
        this.F22.addActionListener(this);
        this.F22.setActionCommand("22");
        this.fontSize.add(this.F22);
        this.F36 = new JMenuItem("36");
        this.F36.addActionListener(this);
        this.F36.setActionCommand("36");
        this.fontSize.add(this.F36);
    }

    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "clear":
                this.functionButton.clear();
                break;
            case "open":
                this.functionButton.open();
                break;
            case "save":
                this.functionButton.save();
                break;
            case "new":
                this.functionButton.New();
                break;
            case "exit":
                this.functionButton.exit();
                break;
            case "blackT":
                this.functionButton.changeTextColor("black");
                break;
            case "whiteT":
                this.functionButton.changeTextColor("white");
                break;
            case "blueT":
                this.functionButton.changeTextColor("blue");
                break;
            case "greenT":
                this.functionButton.changeTextColor("green");
                break;
            case "blackB":
                this.functionButton.changeBgColor("black");
                break;
            case "whiteB":
                this.functionButton.changeBgColor("white");
                break;
            case "blueB":
                this.functionButton.changeBgColor("blue");
                break;
            case "greenB":
                this.functionButton.changeBgColor("green");
                break;
            case "14":
                this.functionButton.changeFontSize(14.0F);
                break;
            case "16":
                this.functionButton.changeFontSize(16.0F);
                break;
            case "22":
                this.functionButton.changeFontSize(22.0F);
                break;
            case "36":
                this.functionButton.changeFontSize(36.0F);
                break;
            case "bold":
                this.functionButton.changeFontStyle(1);
                break;
            case "italic":
                this.functionButton.changeFontStyle(2);
        }

    }
}


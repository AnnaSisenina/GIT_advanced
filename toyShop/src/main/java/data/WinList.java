package data;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WinList {


    public StringBuilder winList;

    public WinList() {
    }
    public WinList(StringBuilder winList) {
        this.winList = winList;
    }

    public void WriteData (){
        File f = new File("./toyShop/src/main/java/data/list.txt");
        if (f.exists()){
            try (FileWriter fw = new FileWriter( f, true)) {
                fw.write("������ ����������� ��������: " + winList.toString() + "\n");
            } catch (IOException e) {
                System.out.println("���� �� ������");
            }
        }
        else {
            try (FileWriter fw = new FileWriter(f)) {
                fw.write("������ ����������� ��������: " + winList.toString() + "\n");
            }catch (IOException e){
                System.out.println("���� �� ������");
            }
        }

    }

    @Override
    public String toString() {
        return "WinList:" + winList;
    }
}

package week2;

public class Krs {
    // atribut
    String[] matkul = new String[5];
    int[] sks = new int[5];
    int totalsks = 0;

    // method
    public void setMatkul(String mk, int index){
        matkul[index] = mk;
    }

    public void setSks(int kredit, int index){
        sks[index] = kredit;
    }

    public void sumSks(){
        for (int i = 0; i < sks.length; i++) {
            totalsks += sks[i];
        }
    }

    public int sizeArray(){
        int count = 0;

        for (int i = 0; i < matkul.length; i++) {
            if (matkul[i] != null) {
                count++;
            }
        }

        return count;
    }

    public void infoKrs(){
        for (int i = 0; i < sizeArray(); i++) {
            System.out.println("Nama Matakuliah = "+matkul[i]+", sks = "+sks[i]);
        }
        sumSks();
        System.out.println("Total SKS = "+totalsks);
    }
}

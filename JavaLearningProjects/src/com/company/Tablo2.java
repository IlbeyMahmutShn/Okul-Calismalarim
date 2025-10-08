class Node {
    int sayi;
    Node next;
    public Node(){
        next = null;
    }
    public Node(int sayi) {
        this.sayi = sayi;
        next = null;
    }
}

public class Tablo2 {
    Node dizi [];
    int size;

    public Tablo2(int size) {
        this.size = size;
        dizi = new Node[size];
        for (int i = 0; i < size; i ++) {
            dizi[i] = new Node();
        }
    }
    int indexUret(int sayi) {
        return sayi % size;
    }
    void ekle(int sayi) {
        int index = indexUret(sayi);
        Node eleman = new Node(sayi);
        Node temp = dizi[index];
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = eleman;
        System.out.println(eleman.sayi + "Eklendi");
    }
    void sil(int sayi) {
        boolean sonuc = false;
        int indis = indexUret(sayi);
        Node temp = dizi[indis];
        Node temp2 = dizi[indis];
        if (temp.next == null) {
            System.out.println(sayi + "Numaralı kayıt yok");
            sonuc = true;
        }
        else if (temp.next.next == null & temp.next.sayi == sayi) {
            sonuc = true;
            System.out.println("Bu kısımdaki son sayı olan " + temp.next.sayi + "Silindi");
            temp.next = null;
        }
        else {
            while (temp.next != null) {
                temp2 = temp;
                temp = temp.next;
                if (temp.sayi == sayi) {
                    sonuc = true;
                    System.out.println(temp.sayi+ "Silindi");
                    temp2.next = temp.next;
                }

            }
        }
        if (!sonuc) {
            System.out.println(sayi + "Numaralı kayıt yok");
        }
    }
    void yazdir() {
        for (int i = 0; i < size; i++) {
            Node temp = dizi[i];

            System.out.println("Dizi["+i+"]->  ");
            if (temp.next != null) {
                while (temp.next != null) {
                    System.out.println(temp.next.sayi + "-" + temp.next.sayi + " ->  ");
                    temp = temp.next;
                }
                System.out.println();
            }
        }
    }
}
class Uygulama {
    public static void main(String[] args) {
        Tablo2 t = new Tablo2(5);
        t.ekle(0);
        t.ekle(10);

        t.ekle(3);
        t.ekle(4);

        t.ekle(2);
        t.ekle(22);

        t.ekle(15);
        t.ekle(9);

        t.sil(15);
        t.yazdir();

    }
}
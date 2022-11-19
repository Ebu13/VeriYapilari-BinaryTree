package tree;

public class TMng {

    public Leaf kok;

    public void yazdır(Leaf temp) {
        if (temp != null) {
            yazdır(temp.left);
            System.out.print(temp.element + " ");
            yazdır(temp.right);
        }
    }

    Leaf sil(Leaf kok, int data) {
        if (kok == null) {
            return kok;
        } else if (kok.element == data) {
            kok.left = null;
            kok.right = null;
            kok.right = sil(kok.right, data);
            kok.left = sil(kok.left, data);
            kok = null;
        } else {
            kok.right = sil(kok.right, data);
            kok.left = sil(kok.left, data);
        }
        return kok;
    }

    Leaf kokekle(Leaf root, int data, int aranan) {
        Leaf temp;
        if (root != null) {
            if (root.left != null) {
                if (root.left.element == aranan) {
                    temp = root.left;
                    Leaf dugum = new Leaf(data);
                    root.left = dugum;
                    root.left.left = temp;
                } else {
                    root.right = kokekle(root.right, data, aranan);
                    root.left = kokekle(root.left, data, aranan);

                }
            }
            if (root.right != null) {
                if (root.right.element == aranan) {
                    temp = root.right;
                    Leaf dugum = new Leaf(data);
                    root.right = dugum;
                    root.right.right = temp;
                } else {
                    root.left = kokekle(root.left, data, aranan);
                    root.right = kokekle(root.right, data, aranan);
                }
            }
        }
        return root;
    }

    public void sagaEkle(Leaf nod, int sayi, int index) {
        if (nod != null) {

            if (nod.element == index) {
                if (nod.right != null) {
                    System.out.print("Sagi Zaten Dolu!\n");
                } else {
                    nod.right = new Leaf(sayi);
                }

            }
            sagaEkle(nod.left, sayi, index);
            sagaEkle(nod.right, sayi, index);
        }
    }

    public void solaEkle(Leaf nod, int sayi, int index) {
        if (nod != null) {
            if (nod.element == index) {
                if (nod.left != null) {
                    System.out.print("Solu Zaten Dolu!\n");
                } else {
                    nod.left = new Leaf(sayi);
                }
            }
            solaEkle(nod.left, sayi, index);
            solaEkle(nod.right, sayi, index);
        }
    }

    public Leaf sonsil(Leaf nod, int aranan) {
        if (nod == null) {
            return nod;
        }
        if (nod.left != null) {
            if (nod.left.element == aranan) {
                nod.left = null;
                nod = null;
            }
        }
        if (nod.right != null) {
            if (nod.right.element == aranan) {
                nod.right = null;
                nod = null;
            }
        }
        sonsil(nod.left, aranan);
        sonsil(nod.right, aranan);
        return nod;
    }
}

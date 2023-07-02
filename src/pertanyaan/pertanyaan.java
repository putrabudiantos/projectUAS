package pertanyaan;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;
import arraylist.*;
import stack.*;

public class pertanyaan {

    public static void questions(List<Integer> listInt, List<String> listString, Stack<Integer> stack,Scanner stdin){
      boolean kondisi = false;
      do {
        System.out.println();
        System.out.print("Data dalam array : " + listInt + "\n");
        if(stack.isEmpty()) System.out.println();
        else System.out.print("Data dalam stack : " + stack);
        System.out.println();
        System.out.println("a. Tambah Data");
        System.out.println("b. Edit Elemen/Value");
        System.out.println("c. Hapus Elemen/Value");
        System.out.println("d. Tampilkan Ukuran Array");
        System.out.println("e. Tampilkan Isi Data");
        System.out.println("f. Konversi array ke Stack");
        System.out.println("g. Reverse Data");
        System.out.println("h. Element Teratas");
        System.out.println("i. Sorting Ascending");
        System.out.println("j. Sorting Descending");
        System.out.println("k. Cari Data");
        System.out.println("l. Keluar Program");
        System.out.println();
        System.out.print("Pilih Salah satu menu: ");
        String jawaban = stdin.next();

        try {
          Integer.parseInt(jawaban); 
          System.out.println("Jawaban tidak boleh integer!");
          kondisi = true;
        }catch(NumberFormatException e) {
          switch(jawaban){
          case "a":
            System.out.print("Masukan length angka : "); 
            tambahdata.tambahData(stdin.nextInt(), listInt, listString, stdin);
            kondisi = true;
            break;
          case "b":
            System.out.print("Pilih index untuk edit value : ");
            int index = stdin.nextInt();
            System.out.println();
            System.out.print("Dengan nilai : ");
            int value = stdin.nextInt();
            System.out.println();
            editdata.editData(index, value, listInt);
            kondisi = true;
            break;
          case "c":
            System.out.print("Masukan index ke-n untuk di hapus : "); 
            hapusdata.hapusData(stdin.nextInt(), listInt);
            kondisi = true;
            break;
          case "d":
            System.out.println("Ukuran array : " + listInt.size());
            kondisi = true;
            break;
          case "e":
            System.out.println("Isi dalam data : " + listInt);
            kondisi = true;
            break;
          case "f":
            konversi.konversiArrayList(listInt, stack);
            System.out.println(stack);
            System.out.println("Tipe data nya adalah " + stack.getClass().getName());
            System.out.println();
            kondisi = true;
            break;
          case "g":
            reversedata.reverseStack(stack);
            System.out.println(stack);
            kondisi = true;
            break;
          case "h":
            System.out.println("Element teratas : " + topelement.topElement(stack));
            kondisi = true;
            break;
          case "i":           
            kondisi = true;
            sortingarray.sortingAsc(listInt);
            break;
          case "j":
            sortingarray.sortingDesc(listInt);
            kondisi = true;
            break;
          case "k":
            System.out.print("Cek ketersediaan data dalam array anda: ");
            int target = stdin.nextInt();
            int result = binarysearch.binarySearch(listInt, target);
            if (result == -1)
                System.out.println("Data tidak tersedia");
            else
                System.out.println("Data " + target + " ditemukan di index ke " + result);
            kondisi = true;
            break;
          case "l":
            System.out.println("Terimakasih :)");
            kondisi = false;
            break;
          default:
            break;
          } 
        }         
      } while (kondisi == true);
      
    }
}

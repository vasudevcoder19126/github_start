import java.util.ArrayList;
import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {

        //Scanner scr= new Scanner(System.in);
        //int n= scr.nextInt();
        /*int[] arr={3,2,4,2,7,6,2};
        int[] ar=rec13(arr,0,2,0);
        for (int value : ar) {
            System.out.print(value + " ");
        }*/
        int[] arr={13.324,343,4,413,1,432,234,12};
        System.out.print("more changes");
    
        int[] sorted=rec20(arr,0,arr.length-1);
        for(int val:sorted){
            System.out.print(val+" ");
        }
        System.out.print("changes for long time");

        //String str = "abc";
        //int count = rec17_3(0, 10);
        //System.out.println(count);
        //int count=rec19_3(0,0,1,1);
        //System.out.println(count);
        //ArrayList<String > array=opti(str);
        //System.out.println(array);
        /*ArrayList<String > array=new ArrayList<>();
        array.add("");
        array.add("a");
        ArrayList<String > array2=new ArrayList<>();
        array2.add("");
        array2.add("b");
        System.out.println(array);
        System.out.println(array2);
        ArrayList<String > last=new ArrayList<>();
        for(String val:array){
            for(String val2:array2){
                last.add(val+val2);
            }
        }
        System.out.println(last);*/
        //ArrayList<String> arr=rec19(0,0,3,3);
        //System.out.println(arr);
        //ArrayList<String> arr2=rec15(str);
        // System.out.println(arr2);
//        ArrayList<String> arr3=rec15(str);
//        System.out.println(arr3);
    }

    public static void rec1(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        rec1(n - 1);
    }

    public static void rec2(int n) {
        if (n == 0) {
            return;
        }
        rec2(n - 1);
        System.out.println(n);
    }

    public static void rec3(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        rec3(n - 1);
        System.out.println(n);
    }

    public static void rec4(int n) {
        if (n == 0) {
            return;
        }
        if (n % 2 != 0) {
            System.out.println(n);
        }
        rec4(n - 1);
        if (n % 2 == 0) {
            System.out.println(n);
        }
    }

    //FACTORIAL
    public static int rec5(int n) {
        if (n == 1) {
            return 1;
        }
        return n * rec5(n - 1);
    }

    //POWER
    public static int rec6(int n, int x) {
        if (n == 0) {
            return 1;
        }
        return x * rec6(n - 1, x);
    }

    //Nth FIBONACCI
    public static int rec7(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        return rec7(n - 1) + rec7(n - 2);
    }

    //TO CHECK WHETHER SORTED OR NOT
    public static boolean rec8(int[] arr, int si) {
        if (si == arr.length - 1) {
            return true;
        }
        if (arr[si] <= arr[si + 1]) {
            return rec8(arr, si + 1);
        } else {
            return false;
        }
    }

    // RETURN FIRST OCCURS OF DATA IN AN ARRAY
    public static int rec9(int[] arr, int si, int data) {
        if (si == arr.length) {
            return -1;
        }
        if (arr[si] == data) {
            return si;
        } else {
            return rec9(arr, si + 1, data);
        }
    }

    public static int rec10(int[] arr, int si, int data) {
        if (si == arr.length) {
            return -1;
        }
        if (arr[si] == data) {
            return Math.max(si, rec10(arr, si + 1, data));
        } else {
            return rec10(arr, si + 1, data);
        }
    }

    //PATTERN
    public static void rec11(int n, int row, int col) {
        if (row > n) {
            return;
        }
        if (col > row) {
            System.out.println();
            rec11(n, row + 1, 1);
            return;
        }
        System.out.print("*");
        rec11(n, row, col + 1);
    }

    //BUBBLE SORT WITH RECURSION ONLY
    public static void rec12(int[] arr, int si, int li) {
        if (li == 0) {
            return;
        }
        if (si == li) {
            rec12(arr, 0, li - 1);
            return;
        }
        if (arr[si] > arr[si + 1]) {
            int temp = arr[si];
            arr[si] = arr[si + 1];
            arr[si + 1] = temp;
        }
        rec12(arr, si + 1, li);
    }

    //ARRAY CONTAINING ALL INDICES WHERE ELEMENT OCCURS
    public static int[] rec13(int[] arr, int si, int data, int count) {
        if (si == arr.length) {
            int[] base = new int[count];
            return base;
        }
        int[] indices = null;
        if (arr[si] == data) {
            indices = rec13(arr, si + 1, data, count + 1);
        } else {
            indices = rec13(arr, si + 1, data, count);
        }
        if (arr[si] == data) {
            indices[count] = si;
        }
        return indices;
    }

    //ALL THE SUBSEQUENCES OF A STRING IN A ARRAYLIST
    public static ArrayList<String> rec14(String str) {
        if (str.length() == 1) {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            base.add(str);
            return base;
        }
        ArrayList<String> fs = new ArrayList<>();
        fs.add("");
        fs.add(str.substring(0, 1));
        ArrayList<String> rss = rec14(str.substring(1));
        ArrayList<String> result = new ArrayList<>();
        for (String val : fs) {
            for (String val2 : rss) {
                result.add(val + val2);
            }
        }
        return result;
    }

    //ALL THE SUBSEQUENCES OF A STRING IN A ARRAYLIST 2.0
    public static ArrayList<String> rec14_2(String str) {
        if (str.length() == 0) {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        char cc = str.charAt(0);
        ArrayList<String> rss = rec14_2(str.substring(1));
        ArrayList<String> result = new ArrayList<>();
        for (String val2 : rss) {
            result.add(val2);
            result.add(cc + val2);
        }
        return result;
    }

    // PRINT SUBSEQUENCES
    public static void rec14_3(String str, String result) {
        if (str.length() == 0) {
            System.out.println(result);
            return;
        }
        char cc = str.charAt(0);
        rec14_3(str.substring(1), result);
        rec14_3(str.substring(1), result + cc);
    }

    //ALL THE SUBSEQUENCES OF A STRING IN A ARRAYLIST WITH ASCII
    public static ArrayList<String> rec15(String str) {
        if (str.length() == 0) {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        char cc = str.charAt(0);
        int ascii = str.charAt(0);
        ArrayList<String> rss = rec15(str.substring(1));
        ArrayList<String> result = new ArrayList<>();
        for (String val2 : rss) {
            result.add(val2);
            result.add(cc + val2);
            result.add(ascii + val2);
        }
        return result;
    }

    // PROCESSED AND UNPROCESSED
    //ALL THE SUBSEQUENCES OF A STRING IN A ARRAYLIST WITH ASCII 2.0 (ANUJ BHAIYA)
    public static ArrayList<String> opti(String unproc) {
        ArrayList<String> list = new ArrayList<>();
        opti("", unproc, list);
        return list;
    }

    private static void opti(String proc, String unproc, ArrayList<String> list) {
        if (unproc.isEmpty()) {
            list.add(proc);
            return;
        }
        char ch = unproc.charAt(0);
        opti(proc + ch, unproc.substring(1), list);
        opti(proc, unproc.substring(1), list);
    }

    //PERMUTATION OF STRING
    public static ArrayList<String> rec16(String str) {
        if (str.length() == 0) {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        char ch = str.charAt(0);
        ArrayList<String> rr = rec16(str.substring(1));
        ArrayList<String> mr = new ArrayList<>();
        for (String rrs : rr) {
            for (int i = 0; i <= rrs.length(); i++) {
                String val = rrs.substring(0, i) + ch + rrs.substring(i);
                mr.add(val);
            }
        }
        return mr;
    }

    // PRINT PERMUTATION OF STRING
    public static void rec16_2(String str, String result) {
        if (str.length() == 0) {
            System.out.println(result);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            rec16_2(str.substring(0, i) + str.substring(i + 1), result + str.substring(i, i + 1));
        }
    }

    // BOARD PATH
    public static ArrayList<String> rec17(int curr, int end) {
        if (curr == end) {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        if (curr > end) {
            ArrayList<String> basene = new ArrayList<>();
            return basene;
        }
        ArrayList<String> fr = new ArrayList<>();
        for (int dise = 1; dise <= 6; dise++) {
            //String str="";
            //str+=dise;
            ArrayList<String> rr = rec17(curr + dise, end);
            for (String s : rr) {
                fr.add(s + dise);
            }
        }
        return fr;
    }

    // PRINT BOARD PATH
    public static void rec17_2(int curr, int end, String result) {
        if (curr == end) {
            System.out.println(result);
            return;
        }
        if (curr > end) {
            return;
        }
        for (int dise = 1; dise <= 6; dise++) {
            rec17_2(curr + dise, end, result + dise);
        }
    }

    // COUNT BOARD PATH
    public static int rec17_3(int curr, int end) {
        if (curr == end) {
            return 1;
        }
        if (curr > end) {
            return 0;
        }
        int result = 0;
        for (int dise = 1; dise <= 6; dise++) {
            result += rec17_3(curr + dise, end);
        }
        return result;
    }

    // MAZE PATH
    public static ArrayList<String> rec18(int ix, int iy, int fx, int fy) {
        if (ix == fx && iy == fy) {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        if (ix > fx || iy > fy) {
            return new ArrayList<>();
        }
        ArrayList<String> fr = new ArrayList<>();
        ArrayList<String> hrr = rec18(ix + 1, iy, fx, fy);
        ArrayList<String> vrr = rec18(ix, iy + 1, fx, fy);
        for (String s : hrr) {
            fr.add("H" + s);
        }
        for (String s : vrr) {
            fr.add("V" + s);
        }
        return fr;
    }

    // PRINT MAZE PATH
    public static void rec18_2(int ix, int iy, int fx, int fy, String result) {
        if (ix == fx && iy == fy) {
            System.out.println(result);
            return;
        }
        if (ix > fx || iy > fy) {
            return;
        }
        rec18_2(ix + 1, iy, fx, fy,result+"H");
        rec18_2(ix, iy + 1, fx, fy,result+"V");
    }

    // COUNT MAZE PATH
    public static int rec18_3(int ix, int iy, int fx, int fy) {
        if (ix == fx && iy == fy) {
            return 1;
        }
        if (ix > fx || iy > fy) {
            return 0;
        }
        int result=0;
        result+=rec18_3(ix + 1, iy, fx, fy);
        result+=rec18_3(ix, iy + 1, fx, fy);
        return result;
    }

    // MAZE PATH DIAGONAL
    public static ArrayList<String> rec19(int ix, int iy, int fx, int fy) {
        if (ix == fx && iy == fy) {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        if (ix > fx || iy > fy) {
            return new ArrayList<>();
        }
        ArrayList<String> fr = new ArrayList<>();
        ArrayList<String> hrr = rec19(ix + 1, iy, fx, fy);
        ArrayList<String> vrr = rec19(ix, iy + 1, fx, fy);
        ArrayList<String> drr = rec19(ix + 1, iy + 1, fx, fy);
        for (String s : hrr) {
            fr.add("H" + s);
        }
        for (String s : vrr) {
            fr.add("V" + s);
        }
        for (String s : drr) {
            fr.add("D" + s);
        }
        return fr;
    }

    // PRINT MAZE PATH DIAGONAL
    public static void rec19_2(int ix, int iy, int fx, int fy, String result) {
        if (ix == fx && iy == fy) {
            System.out.println(result);
            return;
        }
        if (ix > fx || iy > fy) {
            return;
        }
        rec19_2(ix + 1, iy, fx, fy,result+"H");
        rec19_2(ix, iy + 1, fx, fy,result+"V");
        rec19_2(ix+1, iy + 1, fx, fy,result+"D");
    }

    // COUNT MAZE PATH DIAGONAL
    public static int rec19_3(int ix, int iy, int fx, int fy) {
        if (ix == fx && iy == fy) {
            return 1;
        }
        if (ix > fx || iy > fy) {
            return 0;
        }
        int result=0;
        result+=rec19_3(ix + 1, iy, fx, fy);
        result+=rec19_3(ix, iy + 1, fx, fy);
        result+=rec19_3(ix+1, iy + 1, fx, fy);
        return result;
    }

    // MERGE SORT
    public static int[] rec20(int[] arr,int li,int hi) {
        if(li==hi){
            int[] base=new int[1];
            base[0]=arr[li];
            return base;
        }
        int mid=(li+hi)/2;
        int[] fh=rec20(arr,li,mid);
        int[] sh=rec20(arr,mid+1,hi);
        int[] merged=rec20_1(fh,sh);
        return merged;
    }
    private static int[] rec20_1(int[] arr1,int[] arr2){
        int i=0;
        int j=0;
        int k=0;
        int[] arr=new int[arr1.length+arr2.length];
        while(i<arr1.length && j<arr2.length){
            if (arr1[i]<=arr2[j]){
                arr[k]=arr1[i];
                i++;
                k++;
            }
            else{
                arr[k]=arr2[j];
                j++;
                k++;
            }
        }
        if(i==arr1.length){
            while(j<arr2.length){
                arr[k]=arr2[j];
                j++;
                k++;
            }
        }
        if(j==arr2.length){
            while(i<arr1.length){
                arr[k]=arr1[i];
                i++;
                k++;
            }
        }
        return arr;
    }

    // QUICK SORT



}
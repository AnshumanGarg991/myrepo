
import java.util.*;

public class utils {
    public static void main(String[] args) {
        int height[] = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        container(height);

    }

    public static void container(int[] height) {
        int maxCap = Integer.MIN_VALUE;
        int r = 0, b = 0;
        System.out.println(maxCap);
        for (int i = 0; i < height.length - 1; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int min = height[i] > height[j] ? height[j] : height[i];
                int area = min * (j - i);
                if (area > maxCap) {
                    maxCap = area;
                    r = i;
                    b = j;
                }
            }
        }
        System.out.println("The container with maximum capicity will be on index " + r + " and " + b
                + " with maximum capacity =" + maxCap);
    }

    public static void printCombination(int n, int m) {
        String str[] = { "oper", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
        String mtr = str[n];
        String ptr = str[m];
        if (mtr.length() == 0 || ptr.length() == 0) {
            return;
        }
        for (int i = 0; i < str[n].length(); i++) {
            for (int j = 0; j < str[m].length(); j++) {
                // System.out.print(mtr.charAt(i));
                System.out.print(mtr.charAt(i) + "" + ptr.charAt(j) + " ");
            }
            // System.out.println();
        }
    }

    public static void printMatrix(int[][] mat) {
        System.out.println("matrix :");
        for (int[] mat1 : mat) {
            for (int j = 0; j < mat1.length; j++) {
                System.out.print(mat1[j] + " ");
            }
            System.out.println();
        }
    }

    public static void nKnights(int[][] board, int i, int j, int n, int count) {
        if (i >= n || j >= n) {
            return;
        } else if (i < 0 || j < 0) {
            return;
        } else if (board[i][j] != 0 && (i != 0 || j != 0)) {
            return;
        }
        board[i][j] = count;
        nKnights(board, j + 2, i + 1, n, count++);
        nKnights(board, j + 2, i - 1, n, count++);
        nKnights(board, j + 1, i + 2, n, count++);
        nKnights(board, j - 1, i + 2, n, count++);
        // nKnights(board, j - 2, i + 1, n, count++);
        // nKnights(board, j - 2, i - 1, n, count++);
        // nKnights(board, j + 1, i - 2, n, count++);
        // nKnights(board, j - 1, i - 2, n, count++);
        System.out.println("-----board----------count = " + count);
        printMatrix(board);
        count--;
        board[i][j] = 0;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int partition(int[] arr, int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1;
        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;
                arr[i] = arr[i] + arr[j];
                arr[j] = arr[i] - arr[j];
                arr[i] = arr[i] - arr[j];
            }
        }
        i++;
        arr[ei] = arr[i] + arr[ei];
        arr[i] = arr[i] - arr[ei];
        arr[ei] = arr[i] - arr[ei];
        return i;
    }

    public static void quickSort(int[] arr, int si, int ei) {
        if (si >= ei) {
            return;
        }
        // last Element
        int pIdx = partition(arr, si, ei);
        quickSort(arr, si, pIdx - 1); // left
        quickSort(arr, pIdx + 1, ei); // right
    }

    public static boolean isElementRepeat(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int indexFinder(int[] a, int tar) {
        for (int i = 0; i < a.length; i++) {
            if (tar == a[i]) {
                return i;
            }
        }
        return -1;
    }

    public static int profit(int p[]) {
        int max = 0;
        for (int i = 0; i < p.length - 1; i++) {
            for (int j = i + 1; j < p.length; j++) {
                if (p[j] - p[i] > max) {
                    max = p[j] - p[i];
                }
            }
        }
        return max;
    }

    public static int waterFill(int[] a) {
        int sub = 0, unit = 0;
        for (int i = 0; i < a.length - 1; i++) {
            int c = 0;
            if (a[i] != 0) {
                for (int j = i + 1; j < a.length; j++) {
                    if ((a[i] > a[j]) && c == 0) {
                        c++;
                        sub += a[j];
                        continue;
                    }
                    if (a[j] >= a[i] && c == 0) {
                        break;
                    }
                    if (a[j] >= a[i] && c != 0) {
                        unit += c * a[i];
                        i = j - 1;
                        break;
                    } else {
                        c++;
                    }
                    if (a[j] != 0 && a[j] < a[i]) {
                        sub += a[j];
                    }

                }
            }
        }
        return unit - sub;
    }

    public static ArrayList triplets(int[] a) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < a.length - 2; i++) {
            for (int j = i + 1; j < a.length - 1; j++) {
                for (int k = j + 1; k < a.length; k++) {
                    if (a[i] + a[j] + a[k] == 0) {
                        // arr[0]=a[i];arr[1]=a[j];a[2]=a[k];
                        // for(int p:arr){
                        // arrayList.add(p);
                        // }
                        arrayList.add(a[i]);
                        arrayList.add(a[j]);
                        arrayList.add(a[k]);
                    }
                }
            }

        }
        // Collections.addAll(arrayList, arr);
        // System.out.println(arrayList);
        return arrayList;
    }
    // public static void swap(int *a,int *b){
    // *a=*a+*b;
    // *b=*a-*b;
    // *a=*a-*b;
    // }

    public static int[] mySort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    a[i] = a[i] + a[j];
                    a[j] = a[i] - a[j];
                    a[i] = a[i] - a[j];
                }
            }
        }
        return a;
    }

    public static int[] insertionSort(int a[]) {
        for (int i = 0; i < a.length; i++) {
            int k = a[i], j = i - 1;
            while (j >= 0 && a[j] > k) {
                a[j + 1] = a[j];
                j = j - 1;
            }
            a[j + 1] = k;
        }
        return a;
    }

    public static int[] selectionSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int min = a[i], r = i;
            for (int j = i + 1; j < a.length; j++) {
                if (min > a[j]) {
                    min = a[j];
                    r = j;
                }
                a[i] = a[i] + a[r];
                a[r] = a[i] - a[r];
                a[i] = a[i] - a[r];
            }
        }
        return a;
    }

    public static int[] bubbleSort(int[] a) {
        int time = 0;
        for (int turn = 0; turn < a.length - 1; turn++) {
            boolean flag = true;
            time++;
            for (int j = 0; j < a.length - 1; j++) {
                time++;
                if (a[j] > a[j + 1]) {
                    a[j] = a[j] + a[j + 1];
                    a[j + 1] = a[j] - a[j + 1];
                    a[j] = a[j] - a[j + 1];
                    flag = false;
                }
            }
            if (flag) {
                System.out.println(time);
                return a;
            }
        }
        System.out.println(time);
        return a;
    }

    public static int findEleCount(int[][] a, int ele) {
        int count = 0;
        for (int[] a1 : a) {
            for (int j = 0; j < a1.length; j++) {
                if (a1[j] == ele) {
                    count++;
                }
            }
        }
        return count;
    }

    public static int findRowSum(int[][] a, int i) {
        int sum = 0;
        for (int j = 0; j < a[i].length; j++) {
            sum += a[i][j];
        }
        return sum;
    }

    public static void printArray(int[][] a) {
        for (int[] a1 : a) {
            for (int j = 0; j < a1.length; j++) {
                System.out.print(a1[j]);
            }
            System.out.println();
        }
    }

    public static int[][] istranspose(int[][] a) {
        int[][] t = new int[a[0].length][a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                t[j][i] = a[i][j];
            }
        }
        return t;
    }

    public static int lowerVowelCount(String p) {
        int count = 0;
        for (int i = 0; i < p.length(); i++) {
            char ch = p.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                count++;
        }
        return count;
    }

    public static String isanagrams(String a, String b) {
        if (a.length() != b.length()) {
            return "not an anagrams";
        }
        int j = b.length() - 1;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == b.charAt(j)) {
                j++;
            } else {
                return "anagram";
            }
        }
        return "anagrams";
    }
}

package GureumLevel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class FindMine {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        char[][] mine = new char[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mine[i][j] = (char) br.read();
            }
            br.read();
        }

        // 순회하며 지뢰 찾기
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int cnt = 0;
                if (mine[i][j] != '*') {
                    // 인접한 칸 지뢰 개수 체크
                    if (i > 0 && mine[i - 1][j] == '*') cnt++; // 위(i-1, j)
                    if (i > 0 && j < m-1 && mine[i - 1][j + 1] == '*') cnt++; // 위-오른쪽(i-1, j+1)
                    if (j < m-1 && mine[i][j + 1] == '*') cnt++;// 오른쪽(i, j+1)
                    if (i < n-1 && j < m-1 && mine[i + 1][j + 1] == '*') cnt++; //아래-오른쪽(i+1, j+1)
                    if (i < n-1 && mine[i + 1][j] == '*') cnt++; //아래(i+1, j)
                    if (i < n-1 && j > 0 && mine[i + 1][j - 1] == '*') cnt++; //아래-왼쪽(i+1, j-1)
                    if (j > 0 && mine[i][j - 1] == '*') cnt++; //왼쪽(i, j-1)
                    if (i > 0 && j > 0 && mine[i - 1][j - 1] == '*') cnt++; //위-왼쪽(i+1, j-1)
                    mine[i][j] = (char) (cnt + 48);
                }
            }
        }
        /*for(int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(mine[i]));
        }*/
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                System.out.print(mine[i][j]);
            }
            System.out.println();
        }
    }
}
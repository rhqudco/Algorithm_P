package GureumLevel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AutoFindMine {
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
        int [] di = {-1, -1, 0, 1, 1, 1, 0, -1};
        int [] dj = {0, 1, 1, 1, 0, -1, -1, -1};

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++ ) {
                int cnt = 0;
                if (mine[i][j] != '*') {
                    for(int k = 0; k < 8; k++ ) {
                        int ni = i + di[k];
                        int nj = j + dj[k];
                        if (ni >= 0 && ni < n && nj >= 0 && nj < m && mine[ni][nj] == '*') {
                            cnt ++;
                        }
                    }
                    mine[i][j] = (char)(cnt + 48);
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


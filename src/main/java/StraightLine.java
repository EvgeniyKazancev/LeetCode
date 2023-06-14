//¬ам дан массив coordinates, coordinates[i] = [x, y], где [x, y]представл€ет собой координату точки. ѕроверьте, образуют ли эти точки пр€мую линию в плоскости XY.

public class StraightLine {
    public boolean checkStraightLine(int[][] coordinates) {
       int n = coordinates.length;
       int x1 = coordinates[0][0];
       int y1 = coordinates[0][1];
       int x2 = coordinates[1][0];
       int y2 = coordinates[1][1];
        for (int i = 0; i < n; i++) {
           int x = coordinates[i][0];
           int y = coordinates[i][1];
            if((y - y1) * (x - x2) != (y - y2) * (x - x1) ){
                return false;
            }

        }
        return true;
    }
}

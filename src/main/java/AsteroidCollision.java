public class AsteroidCollision {
    public int[] asteroidCollision(int[] asteroids) {
        int n = asteroids.length;
        int x = 0;
        for (int i = 0; i < n; i++) {
            int as = asteroids[i];
          while (x > 0 && asteroids[x - 1] > 0 && as < 0 && asteroids[x -1] < Math.abs(as)){
               x--;
           }
          if (x == 0 || as > 0 || asteroids[x - 1] < 0)
              asteroids[x++] = as;
          else  if (asteroids[x - 1] ==Math.abs(as))
              x--;
        }
        int[] res = new int [x];
        System.arraycopy(asteroids,0,res,0,x);
        return res;
    }
}

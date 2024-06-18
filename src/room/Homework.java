package room;

public class Homework {

    public static void main(String[] args) {
//      // xndir 21
//      int x = 10;
//      int y = 20;
//      int z = 30;

//      if (x > y && x > z) {
//          System.out.println(x);
//      } else if (y > x && y > z) {
//          System.out.println(y);
//      } else {
//          System.out.println(z);
//      }



 //     // xndir 22
 //     int x = 10;
 //     int y = 20;
 //     int z = 30;
 //
 //     if (x < y && x < z) {
 //         System.out.println(x);
 //     } else if (y < x && y < z) {
 //         System.out.println(y);
 //     } else {
 //         System.out.println(z);
 //     }


//       // xndir 23
//       int x = 1;
//       int y = 2;
//       int z = 3;

//       if ((x == 1) || (y == 1) || (z == 1)) {
//           System.out.println("true");
//       }else {
//           System.out.println("false");
//       }



//      //xndir 24
//      int x = 2;
//      int y = 2;
//      int z = 3;

//      if ((x == 2 && y == 2) || (x == 2 && z == 2) || (y == 2 && z == 2)) {
//          System.out.println("true");
//      }else {
//          System.out.println("false");
//      }



//       //xndir 25
//       int x = 3;
//       int y = 5;
//       int z = 7;

//       if ((x + y > z) && (x + z > y) && (y + z > x)) {
//           System.out.println("y=1");
//       }else {
//           System.out.println("y=2");
//       }


//       //xndir 26
//       int x = 2;
//       int y = 3;
//       int z = 7;

//       if ((x %2 == 0) || (y %2 == 0) || (z %2 == 0)) {
//           System.out.println(1);
//       }else {
//           System.out.println(2);
//       }



//       //xndir 27
//       int x = 7;
//       int y = 6;
//       int z = 2;

//       if ((x < y)  && (y < z)) {
//           if ((y - x) == (z - y)) {
//               System.out.println("true");
//           }else {
//               System.out.println("false");
//           }
//       }else if ((x < z)  && (z < y)) {
//           if ((z - x) == (y - z)) {
//               System.out.println("true");
//           }else {
//               System.out.println("false");
//           }
//       }else if ((y < x) && (x < z)) {
//           if ((x - y) == (z - x)) {
//               System.out.println("true");
//           }else {
//               System.out.println("false");
//           }
//       }else if ((y < z) && (z < x)) {
//           if ((z - y) == (x - z)) {
//               System.out.println("true");
//           }else {
//               System.out.println("false");
//           }
//       }else if ((z < x) && (x < y)) {
//           if ((x - z) == (y - x)) {
//               System.out.println("true");
//           }else {
//               System.out.println("false");
//           }
//       }else if ((z < y) && (y < x)) {
//           if ((y - z) == (x- y)) {
//               System.out.println("true");
//           }else {
//               System.out.println("false");
//           }
//       }



//       //xndir 28
//       int x = 4;
//       int y = 8;
//       int z = 2;

//       if ((x < y)  && (y < z)) {
//           if ((y / x) == (z / y)) {
//               System.out.println("true");
//           }else {
//               System.out.println("false");
//           }
//       }else if ((x < z)  && (z < y)) {
//           if ((z / x) == (y / z)) {
//               System.out.println("true");
//           }else {
//               System.out.println("false");
//           }
//       }else if ((y < x) && (x < z)) {
//           if ((x / y) == (z / x)) {
//               System.out.println("true");
//           }else {
//               System.out.println("false");
//           }
//       }else if ((y < z) && (z < x)) {
//           if ((z / y) == (x / z)) {
//               System.out.println("true");
//           }else {
//               System.out.println("false");
//           }
//       }else if ((z < x) && (x < y)) {
//           if ((x / z) == (y / x)) {
//               System.out.println("true");
//           }else {
//               System.out.println("false");
//           }
//       }else if ((z < y) && (y < x)) {
//           if ((y / z) == (x / y)) {
//               System.out.println("true");
//           }else {
//               System.out.println("false");
//           }
//       }



//      //xndir 29
//      int x = 9;
//      int y = 8;
//      int z = 6;

//      if ((x < y) && (y < z)) {
//          System.out.println(x + " " + y + " " + z);
//      }else if ((x < z) && (z < y)) {
//          System.out.println(x + " " + z + " " + y);
//      }else if ((y < x) && (x < z)) {
//          System.out.println(y + " " + x + " " + z);
//      }else if ((y < z) && (z < x)) {
//          System.out.println(y + " " + z + " " + x);
//      }else if ((z < x) && (x < y)) {
//          System.out.println(z + " " + x + " " + y);
//      }else if ((z < y) && (y < x)) {
//          System.out.println(z + " " + y + " " + x);
//      }



        //xndir 30
        int x = 9;
        int y = 8;
        int z = 6;

        if ((x < y) && (y < z)) {
            System.out.println(z + " " + y + " " + x);
        }else if ((x < z) && (z < y)) {
            System.out.println(y + " " + z + " " + x);
        }else if ((y < x) && (x < z)) {
            System.out.println(z + " " + x + " " + y);
        }else if ((y < z) && (z < x)) {
            System.out.println(x + " " + z + " " + y);
        }else if ((z < x) && (x < y)) {
            System.out.println(y + " " + x + " " + z);
        }else if ((z < y) && (y < x)) {
            System.out.println(x + " " + y + " " + z);
        }
    }
}
package com;

import com.players.Mb3ToMb4Adapter;
import com.players.PlayerDevice;
import com.shapes.Circle;
import com.shapes.ShapesManager;
import com.shapes.Square;

public class Main {

    public static void main(String[] args) {
//        {
//            Circle newCircle = new Circle(5, "newCircle");
//            Square newSquare = new Square(5, "newSquare");
//            //System.out.printf("area of square with name: %s %s \n", newCircle.getName(), newCircle.area());
//            //System.out.printf("area of square with name: %s %s \n", newSquare.getName(), newSquare.area());
//            ShapesManager.getInstance().displayShapes();
//        }

        {
            PlayerDevice playerDevice = new PlayerDevice();
            playerDevice.playMb3();
            Mb3ToMb4Adapter adapter = new Mb3ToMb4Adapter(playerDevice);
            playerDevice.playMb4(adapter);
        }
    }
}

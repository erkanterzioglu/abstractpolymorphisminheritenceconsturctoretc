package com.erkanterzioglu.oopproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        User myUser=new User();
        myUser.name="Atil";
        myUser.job="Instructor";

        User newUSer =new User();
        newUSer.name="Kirk";
        newUSer.job="Musician";
        */
        User myUser=new User("Atil","Instructor");
        System.out.println(myUser.information);


        //Encapsulation
        Musician james= new Musician("James","Guitar",50);
        System.out.println(james.getName());
        james.setAge(60,"erkan");
        System.out.println(james.getAge());

        //Inheritance
        SuperMusician lars=new SuperMusician("Lars","Drums",55);
        System.out.println(lars.getAge());
        lars.sing();

        //Polymorphism

        //Static Polymorphism
        Mathematics mathematics = new Mathematics();
        System.out.println(mathematics.sum());
        System.out.println(mathematics.sum(5,3));
        System.out.println(mathematics.sum(5,3,4));

        //Dynamic Polymorphism
        Animal myAnimal=new Animal();
        myAnimal.sing();
        Dog barley=new Dog();
        barley.test();
        barley.sing();
        Piano myPiano =new Piano();
        myPiano.brand="Yamaha";
        myPiano.digital=true;
        myPiano.info();

    }
}
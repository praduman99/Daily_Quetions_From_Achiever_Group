����   4 T  achieversgroup/q0001  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this Lachieversgroup/q0001; main ([Ljava/lang/String;)V  java/util/Scanner	    java/lang/System   in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V	     out Ljava/io/PrintStream;   Enter size of array
 " $ # java/io/PrintStream % & println (Ljava/lang/String;)V
  ( ) * nextInt ()I , Enter the sum . java/lang/StringBuilder 0 the range of indices :
 - 2  &
 - 4 5 6 append (I)Ljava/lang/StringBuilder; 8 ,
 - : 5 ; -(Ljava/lang/String;)Ljava/lang/StringBuilder;
 - = > ? toString ()Ljava/lang/String;
 " A B & print args [Ljava/lang/String; sc Ljava/util/Scanner; size I arr [I i sum total j StackMapTable D J 
SourceFile 
q0001.java !               /     *� �    
                    	      �     �� Y� � L� � !+� '=�
N6� -+� 'O����6� +� !+� '66� K6� :-.`6� '� � -Y/� 1� 37� 9� 3� <� @� �-���ń-�����    
   N             "  *  3  6  >  D  J   Q " Z # a % � & �   �  � .    \ 	   � C D    � E F   � G H   ~ I J    K H  6 d L H  D V M H  G R K H  N A N H  O   $ � "  P  Q  
� � 3�   R    S
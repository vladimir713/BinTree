/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package chugunov.bintree;

/**
 *
 * @author ya
 */
class Node {
   private Object value; // ключ узла
   private Node leftChild; // Левый узел потомок
   private Node rightChild; // Правый узел потомок

   public void printNode() { // Вывод значения узла в консоль
       System.out.println(" Выбранный узел имеет значение :" + value);
   }

   public Object getValue() {
       return this.value;
   }

   public void setValue(final Object value) {
       this.value = value;
   }

   public Node getLeftChild() {
       return this.leftChild;
   }

   public void setLeftChild(final Node leftChild) {
       this.leftChild = leftChild;
   }

   public Node getRightChild() {
       return this.rightChild;
   }

   public void setRightChild(final Node rightChild) {
       this.rightChild = rightChild;
   }

//   @Override
//   public String toString() {
//       return "Node{" +
//               "value=" + value +
//               ", leftChild=" + leftChild +
//               ", rightChild=" + rightChild +
//               '}';
//   }
}

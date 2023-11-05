Properties of generic class:

The default size of the array within the class is 10, and the number of elements of the array should increase by a factor of 2 as needed.

There must be two types of constructor methods for the class.

MyList(): If an empty contructor is used, the initial size of the array should be 10.

MyList(int capacity): The initial value of the array must be taken from the capacity parameter.

size() : returns the number of elements in the array.

getCapacity(): returns the capacity value of the array.

add(T data): should be used to add elements to the array of the class. If there is not enough space in the array, the array size should be doubled.

get(int index): returns the value at the given index. If an invalid index is entered, it returns null.

remove(int index): should delete the data at the given index and shift the data after the deleted index to the left. If an invalid index is entered, it returns null.

set(int index, T data): It should replace the data in the given index with the new one. If an invalid index is entered, it returns null.

String toString(): A method that lists the elements in the array belonging to the class.

int indexOf(T data): Returns the index of the object given in the parameter in the list. Returns -1 if the object is not in the list.

int lastIndexOf(T data): Tells the last index of the specified item in the list. Returns -1 if the object is not in the list.

boolean isEmpty(): Tells whether the list is empty or not.

T[] toArray(): Converts the items in the list into an array in the same order.

clear(): Clears all items in the list, turning it into an empty list.

MyList<T> sublist(int start,int finish) : Returns a list of the index range given in the parameter.

boolean contains(T data): Tells whether the value given in the parameter is in the array.

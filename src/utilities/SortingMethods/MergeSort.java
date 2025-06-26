package utilities.SortingMethods;

import shapes.ThreeDShape;

public class MergeSort {

    //Sort by Height
    public static void SortHeight(ThreeDShape[] shapesArray) {
        int inputLength = shapesArray.length;

        if (inputLength < 2) { //Arrays with length less than 2 have either one item in it or none, in both cases neither can be sorted further
            return;
        }

        //get mid-point of array
        int midIndex = inputLength / 2;
        ThreeDShape[] leftArray = new ThreeDShape[midIndex]; //midIndex gives us the size of the array
        ThreeDShape[] rightArray = new ThreeDShape[inputLength - midIndex]; //this ensures we get halves if start length is odd or even

        //populate the arrays
        //populate left array
        for (int i = 0; i < midIndex; i++) {
            leftArray[i] = shapesArray[i];
        }

        //populate right array
        for (int i = midIndex; i < inputLength; i++) {
            rightArray[i - midIndex] = shapesArray[i];
        }

        SortHeight(leftArray);
        SortHeight(rightArray);

        MergeHeight(shapesArray, leftArray, rightArray);
    }

    public static void MergeHeight(ThreeDShape[] shapesArray, ThreeDShape[] leftArray, ThreeDShape[] rightArray) {
        int leftSize  = leftArray.length;
        int rightSize = rightArray.length;

        int i = 0; //iterator for right half
        int j = 0; //iterator for left half
        int k = 0; //iterator for the merged array
        while (i < leftSize && j < rightSize) { //goes until either the left or right array runs out BUT still need to do cleanup for the array that didn't run out of numbers
            if (leftArray[i].compareTo(rightArray[j]) <= 0) {
                shapesArray[k] = leftArray[i];
                i++;
            }
            else {
                shapesArray[k] = rightArray[j];
                j++;
            }
            k++;
        }

        //to account for any items leftover in the left array
        while (i < leftSize) {
            shapesArray[k] = leftArray[i];
            i++;
            k++;
        }
        //to account for any items leftover in the right array
        while (j < rightSize) {
            shapesArray[k] = rightArray[j];
            j++;
            k++;
        }
    }

    //Sort by Base Area
    public static void SortBaseArea(ThreeDShape[] shapesArray) {
        int inputLength = shapesArray.length;

        if (inputLength < 2) { //Arrays with length less than 2 have either one item in it or none, in both cases neither can be sorted further
            return;
        }

        //get mid-point of array
        int midIndex = inputLength / 2;
        ThreeDShape[] leftArray = new ThreeDShape[midIndex]; //midIndex gives us the size of the array
        ThreeDShape[] rightArray = new ThreeDShape[inputLength - midIndex]; //this ensures we get halves if start length is odd or even

        //populate the arrays
        //populate left array
        for (int i = 0; i < midIndex; i++) {
            leftArray[i] = shapesArray[i];
        }

        //populate right array
        for (int i = midIndex; i < inputLength; i++) {
            rightArray[i - midIndex] = shapesArray[i];
        }

        SortBaseArea(leftArray);
        SortBaseArea(rightArray);

        MergeBaseArea(shapesArray, leftArray, rightArray);
    }

    public static void MergeBaseArea(ThreeDShape[]  shapesArray, ThreeDShape[] leftArray, ThreeDShape[] rightArray) {
        int leftSize  = leftArray.length;
        int rightSize = rightArray.length;

        int i = 0; //iterator for right half
        int j = 0; //iterator for left half
        int k = 0; //iterator for the merged array
        while (i < leftSize && j < rightSize) { //goes until either the left or right array runs out BUT still need to do cleanup for the array that didn't run out of numbers
            if (ThreeDShape.BaseAreaComparator.compare(leftArray[i], rightArray[j] ) <= 0) {
                shapesArray[k] = leftArray[i];
                i++;
            }
            else {
                shapesArray[k] = rightArray[j];
                j++;
            }
            k++;
        }
        //to account for any items leftover in the left array
        while (i < leftSize) {
            shapesArray[k] = leftArray[i];
            i++;
            k++;
        }
        //to account for any items leftover in the right array
        while (j < rightSize) {
            shapesArray[k] = rightArray[j];
            j++;
            k++;
        }
    }

    //Sort By Volume
    public static void SortVolume(ThreeDShape[] shapesArray) {
        int inputLength = shapesArray.length;

        if (inputLength < 2) { //Arrays with length less than 2 have either one item in it or none, in both cases neither can be sorted further
            return;
        }

        //get mid-point of array
        int midIndex = inputLength / 2;
        ThreeDShape[] leftArray = new ThreeDShape[midIndex]; //midIndex gives us the size of the array
        ThreeDShape[] rightArray = new ThreeDShape[inputLength - midIndex]; //this ensures we get halves if start length is odd or even

        //populate the arrays
        //populate left array
        for (int i = 0; i < midIndex; i++) {
            leftArray[i] = shapesArray[i];
        }

        //populate right array
        for (int i = midIndex; i < inputLength; i++) {
            rightArray[i - midIndex] = shapesArray[i];
        }

        SortVolume(leftArray);
        SortVolume(rightArray);

        MergeVolume(shapesArray, leftArray, rightArray);
    }

    public static void MergeVolume(ThreeDShape[]  shapesArray, ThreeDShape[] leftArray, ThreeDShape[] rightArray) {
        int leftSize  = leftArray.length;
        int rightSize = rightArray.length;

        int i = 0; //iterator for right half
        int j = 0; //iterator for left half
        int k = 0; //iterator for the merged array
        while (i < leftSize && j < rightSize) { //goes until either the left or right array runs out BUT still need to do cleanup for the array that didn't run out of numbers
            if (ThreeDShape.VolumeComparator.compare(leftArray[i], rightArray[j] ) <= 0) {
                shapesArray[k] = leftArray[i];
                i++;
            }
            else {
                shapesArray[k] = rightArray[j];
                j++;
            }
            k++;
        }
        //to account for any items leftover in the left array
        while (i < leftSize) {
            shapesArray[k] = leftArray[i];
            i++;
            k++;
        }
        //to account for any items leftover in the right array
        while (j < rightSize) {
            shapesArray[k] = rightArray[j];
            j++;
            k++;
        }
    }


}



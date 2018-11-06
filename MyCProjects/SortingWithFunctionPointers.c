#include <stdio.h>

#include <stdlib.h>



int compare (const void *, const void *); 



int main() {
    
    
	int arr1[5] = {52, 23, 56, 19, 4};
    
    
	int *arr2[5];
    
	int k = 0;
    
	printf("Enter five numbers:");
    
	for(int j = 0; j < 5; j++) {
        
		printf("%d) ", j + 1);
        
		scanf("%d", &k);
        
		arr2[j] = k;
    
	}
   

    
    
    
    
	int num, width, i;
    
	printf("before sorting: \n");
     
	for (i = 0; i < 5; i++) {
        
		printf("%d ", arr2[ i ]);
    
	}
    
	printf("\nafter sorting:\n");
    
    
	num = sizeof(arr2)/sizeof(arr2[0]);
    
	width = sizeof(arr2[0]);
    
	qsort((void *)arr2, num, width, compare);
    
	for (i = 0; i < 5; i++) {
        
		printf("%d ", arr2[ i ]);
    
	}
    
	return 0;

}



int compare (const void *elem1, const void *elem2) {
    
	if ((*(int *)elem1) == (*(int *)elem2))
        
		return 0;
    
	else if ((*(int *)elem1) < (*(int *)elem2))
        
		return -1;
    
	else
        
		return 1;
} 
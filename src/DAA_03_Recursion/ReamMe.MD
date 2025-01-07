Tail Recursion
* tail recursive functions are faster than normal recursive function as they do not save state of the function call.
* Eg.

    fun (int n) {
            .
            .
      some statements
            .
            .

      fun(num)
    }
* in above case compiler place goto at the last and label in the beginning of function which save some time.
* Below code is not Tail recursion as the final output depends on the function call.
    
    int fact(int n) {
        if(n = 0 || n = 1) {
            return 1;
        }
        return n * fact(n-1);
    }

* Equivalent tail recursion of above function
    int fact(int n, int k) {
        if(n = 0 || n = 1) {
            return k;
        }
        return fact(n-1, n * k);
    }










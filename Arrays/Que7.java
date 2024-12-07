    ArrayList<Integer> pos = new ArrayList<>();
    ArrayList<Integer> nag = new ArrayList<>();
    
    // Separate numbers into their respective lists
    int i = 0;
    while (i < arr.length) {
        if (arr[i] < 0) {
            nag.add(arr[i]);
        } else {
            pos.add(arr[i]);
        }
        i++;
    }

    // Copy all positive numbers sequentially first
    i = 0; // Reset index
    int posIndex = 0;
    while (posIndex < pos.size()) {
        arr[i++] = pos.get(posIndex++);
    }

    // Copy all negative numbers sequentially after the positive numbers
    int nagIndex = 0;
    while (nagIndex < nag.size()) {
        arr[i++] = nag.get(nagIndex++);
    }
}

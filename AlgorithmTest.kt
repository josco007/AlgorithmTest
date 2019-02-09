
fun main(args: Array<String>) {

    
    println("[1, 4, 10, 4, 2] = "+ almostIncreasingSequence(mutableListOf(1, 4,10, 2, 3)))
    println("[1, 2, 1, 2]= "+ almostIncreasingSequence(mutableListOf(1, 2, 1, 2)))
    println("[1, 3, 2] = "+ almostIncreasingSequence(mutableListOf(1, 3, 2)))
    println("[1, 3, 2, 1]  = "+ almostIncreasingSequence(mutableListOf(1, 3, 2, 1)))

}

fun almostIncreasingSequence(sequence: MutableList<Int>): Boolean {
	
    var sequenceSize: Int = sequence.size;
    var aux: Int = -1;
    var c: Int=0;
    
    var i: Int = 1;
    while (i<sequenceSize){
        if (sequence.get(i-1) >= sequence.get(i)){
            aux = i;
            c++;
        }
        i += 1;
    }

    if (c > 1){
        return false
    }
    else if (c == 0){
        return true
    }
    else if (aux == sequenceSize-1 || aux == 1){
        return true
    }
    else if (sequence.get(aux-1) < sequence[aux+1]){
        return true;
    }
    else if (sequence.get(aux-2) < sequence[aux]){
        return true
    }

    return false;
	
}
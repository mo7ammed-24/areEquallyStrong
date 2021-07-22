fun main() {
print(areEquallyStrong(10,15,15,10))
}

fun areEquallyStrong(yourLeft: Int, yourRight: Int, friendsLeft: Int, friendsRight: Int): Boolean {

    if(yourLeft+yourRight==friendsRight+friendsLeft){
        if(yourRight>=yourLeft){
            if(friendsLeft>=friendsRight && yourRight==friendsLeft)
                return true
            else if(friendsRight>=friendsLeft && yourRight==friendsRight)
                return true
            else
                return false
        }
        else{
            if(friendsLeft>=friendsRight && yourLeft==friendsLeft)
                return true
            else if(friendsRight>=friendsLeft && yourLeft==friendsRight)
                return true
            else
                return false

        }
    }
    else return false
}

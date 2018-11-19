package HorseRunner;

public class HorseBarn {
    public int findHoerseSpace(String name){
        for(int i = 0; i < this.spaces.length; i++){
            if (this.space[i]!=null && name.equals(this.spaces[i].getName())){
                return i;
            }
        }
        return -1;
    }
}

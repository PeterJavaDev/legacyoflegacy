package pl.lagacyoflagacy.logic.character;

public class Npc extends AbsrtactCharacter {

    private boolean enemy = true;

    public boolean isEnemy() {
        return enemy;
    }

    public void setEnemy(boolean enemy) {
        this.enemy = enemy;
    }
}

package Group3;

import java.util.ArrayList;
import Interop.Geometry.Point;
import Interop.Percept.Sound.SoundPerceptType;


public class SoundStorage {

	private ArrayList<Sound> sounds = new ArrayList<>();
	
	public ArrayList<Sound> getSounds() {
		return sounds;
	}

	public void setSounds(ArrayList<Sound> sounds) {
		this.sounds = sounds;
	}
	
	public void addSound(SoundPerceptType type, Point point, Integer timeLeft, Double radius) {
			Sound quartet = new Sound(type, point, timeLeft, radius);
			sounds.add(quartet);
	}
	
	public void updateSounds() {
		ArrayList<Sound> remove = new ArrayList<>();
		
		for (int i = 0; i < sounds.size(); i++) {
			sounds.get(i).setTurnsLeft(sounds.get(i).getTurnsLeft()-1);
			if (sounds.get(i).getTurnsLeft() <= 0) {
				remove.add(sounds.get(i));
			}
		}
		
		sounds.removeAll(remove);
	}
}
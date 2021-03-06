package GUI.map.objects;

import GUI.map.area.ModifySpeedEffect;
import GUI.map.area.ModifyViewEffect;
import GUI.map.area.SoundEffect;
import GUI.tree.PointContainer;
import Interop.Percept.Sound.SoundPerceptType;
import Interop.Percept.Vision.ObjectPerceptType;

public class Door extends MapObject {

    public Door(PointContainer.Polygon area,
                double guardViewModifier, double intruderViewModifier,
                double soundRadius,
                double guardSpeedModifier, double intruderSpeedModifier) {
        super(area, ObjectPerceptType.Door);
        this.addEffects(new ModifyViewEffect(this, area, guardViewModifier, intruderViewModifier),
                new SoundEffect(this, area, SoundPerceptType.Noise, soundRadius),
                new ModifySpeedEffect(this, area, guardSpeedModifier, intruderSpeedModifier));
    }

}

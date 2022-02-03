package com.tiendamusicfact;

import com.tiendamusicfact.interf.IReproductorfact;
import com.tiendamusicfact.interf.imple.BatteryAdds;
import com.tiendamusicfact.interf.imple.ColorAdds;
import com.tiendamusicfact.interf.imple.Error;
import com.tiendamusicfact.interf.imple.StorageAdds;

public class Reproductor2 {

    public IReproductorfact getAdds(String tipoAdd){
        if (tipoAdd == null){
            return new Error();

        }
        if (tipoAdd.equalsIgnoreCase("bat")){
            return new BatteryAdds();
        }else if (tipoAdd.equalsIgnoreCase("col")){
            return new ColorAdds();
        }else if (tipoAdd.equalsIgnoreCase("stor")){
            return new StorageAdds();
        }

        return new Error();
    }


}

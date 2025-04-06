package org.lenny.behavioural.adapter;

import java.util.List;

public interface DatabaseDataConverter {
    List<DisplayData3rdParty> convertData(List<DatabaseData> data);
}

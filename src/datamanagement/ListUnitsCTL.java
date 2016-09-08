package datamanagement;
public class ListUnitsCTL {
    private UnitManager um;
    //create listunitsclt public function
public ListUnitsCTL() {
        um = UnitManager.UM();
}
            public void listUnits( IUnitLister lister ) {
lister.clearUnits();UnitMap units = um.getUnits();
        for (String s : units.keySet() )
            lister.addUnit(units.get(s));}}

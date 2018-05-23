package SorteOpgaver.ch11.aske1208_a_11_5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class five
{
    public void sortAndRemoveDuplicates(List<Integer> list)
    {
        List<Integer> sortedAndNoDuplicates = new ArrayList<>();

        for (Integer integer : list)
        {
            if (!sortedAndNoDuplicates.contains(integer))
            {
                sortedAndNoDuplicates.add(integer);
            }
        }

        Collections.sort(sortedAndNoDuplicates);

        for (Integer integer : sortedAndNoDuplicates)
        {
            System.out.println(integer);
        }
    }
}

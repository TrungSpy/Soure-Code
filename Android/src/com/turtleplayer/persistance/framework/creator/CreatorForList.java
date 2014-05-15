package com.turtleplayer.persistance.framework.creator;

import java.util.*;

/**
 * @author Phan Van Trung
 */

/**
 * @param <RESULT> Instance type
 * @param <S> Source type of row
 * @param <M> Source type of table
 */
public abstract class CreatorForList<TARGET, RESULT, S, M> implements ResultCreator<TARGET, List<RESULT>, M>
{
    private final Creator<? extends RESULT, S> creator;

    protected CreatorForList(Creator<? extends RESULT, S> creator)
    {
        this.creator = creator;
    }

    public List<RESULT> create(M queryResult)
    {
        List<RESULT> result = new ArrayList<RESULT>();

        while(hasNext(queryResult))
        {
            result.add(creator.create(next(queryResult)));
        }

        return result;
    }

    protected abstract boolean hasNext(M queryResult);

    protected abstract S next(M queryResult);
}

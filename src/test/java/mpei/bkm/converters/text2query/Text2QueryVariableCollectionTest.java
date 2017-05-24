package mpei.bkm.converters.text2query;

import mpei.bkm.converters.UnconvertableException;
import mpei.bkm.model.query.variable.QueryVariableCollection;
import org.junit.Test;
import org.junit.Assert;

public class Text2QueryVariableCollectionTest {
    @Test
    public void testText2Query() throws UnconvertableException {
        String qs = "?X - X IN STUDENT;(X RelName Y); RelName(X).AGE = 32; X.NAME='ИВАН'; Y IN TEACHER(NAME ='ВАСЯ'; TEACHES = X);X.Name = WHATEVER";
        //"_3.V - X IN STUDENT; _2.W = _3; _1.Z = _2; X.Y = _1"
        //qs = "?AVG(Z.Оценка) - Z IN СдалЭкзамен(Предмет.Назв =\n" +
        //        "'дискретная матем.'; Студент.Группа.Номер = А13-08)";
        Text2QueryVariableCollection text2QueryVariableCollection = new Text2QueryVariableCollection();
        QueryVariableCollection q = text2QueryVariableCollection.convert(qs);
        Assert.assertEquals(q.getGoals().get(0).getVariable().getName(), "X");
    }
}
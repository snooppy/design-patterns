package ua.cn.dmitrykrivenko.factory.factorymethod;

/**
 * @author Dmytro Kryvenko <dmitrykrivenko@gmail.com>
 */
public interface WriterCreator
{

   /**
    * Factory method.
    *
    * @return concrete writer
    */
   Writer createWriter();

}

SCHEME 'РС+С':
    ПроизводМодуль[Робот,ДепозитЛента,ПодающЛента,Кран].
    Робот[1-рука,2-рука,Мотор, Поворот:[0-90]].
    Мотор[Включен:Boolean].
    ДепозитЛента[Мотор,ФотоэлементДейств:Boolean].
    ПодающЛента[Мотор,ФотоэлементДейств:Boolean].
    2-Рука[Выдвинута:Boolean].
    (Заготовка Находится_на ДепозитЛента)[Позиция:Boolean].
    (Заготовка Находится_на ПодающЛента)[Позиция:Boolean].
    ПодъемПоворотСтолик[Положение:{нижнее,верхнее},Поворот:{min,max}, Загружен: Boolean,Поднят:Boolean].
    Пресс[Состояние: {открыт1,открыт2,закрыт},Ковка: Boolean].
END
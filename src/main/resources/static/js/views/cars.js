define(['component/listPage', 'collections/models'], function (listPage, models) {
  return listPage(
      'carList',
      'resource->/api/car',
      [
        {id: 'name', editor: 'text'},
        {id: 'models', editor: 'combo', options: models},
      ],
  );
});
define(function () {
  return {
    type: 'line',
    container: 'app',
    height: 400,
    rows: [
      {
        view: 'button',
        label: 'Cars',
        click: function () {
          routie('cars')
        }
      },
      {template: 'Row 1'},
      {template: 'Row 2'},
      {
        cols: [
          {template: 'Col 1'},
          {template: 'Col 2'},
        ],
      },
    ],
  }
})
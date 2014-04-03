/**
 * @module AsquareConnect
 * @main AsquareConnect
 */
module AsquareConnect {

  export var rootPath = 'app/AsquareConnect';
  export var templatePath = rootPath + '/html/';
  export var pluginName = 'AsquareConnect';

  angular.module(pluginName, ['bootstrap', 'ngResource', 'datatable', 'hawtioCore', 'hawtio-forms', 'ui']).
          config(($routeProvider) => {
            $routeProvider.
                    when('/AsquareConnect/discover', {templateUrl: templatePath + 'discover.html'}).
                    when('/AsquareConnect/connect', {templateUrl: templatePath + 'connect.html'}).
                    when('/AsquareConnect/local', {templateUrl: templatePath + 'local.html'});
          }).
          constant('mbeanName', 'hawtio:type=AsquareConnectList').
          run(($location, workspace:Workspace, viewRegistry, layoutFull, helpRegistry) => {

            viewRegistry[pluginName] = templatePath + 'layoutConnect.html';
            helpRegistry.addUserDoc('AsquareConnect', 'app/AsquareConnect/doc/help.md');

            workspace.topLevelTabs.push({
              id: "connectas",
              content: "Connections",
              title: "Connect to AIB Brokers",
              isValid: (workspace) => true,
              href: () => {
                return '#/AsquareConnect/connect';
              },
              isActive: (workspace:Workspace) => workspace.isLinkActive("AsquareConnect")
            });
          });

  hawtioPluginLoader.addModule(pluginName);
}

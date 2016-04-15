angular.module('MeetingsAgenda').directive('pmPageNav', function() {
    return {
        replace: true,
        restrict: 'E',
        templateUrl: 'views/pmPageNav.html',
        controller: function($scope, $location) {

            $scope.isPage = function(name) {
                return new RegExp("/" + name + "$").test($location.path());
            };
            
        }
    };
});
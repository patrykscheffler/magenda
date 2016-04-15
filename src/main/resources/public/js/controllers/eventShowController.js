angular.module('MeetingsAgenda').controller('EventsShowController', function(Event, $scope, $routeParams, $location) {
    $scope.event = Event.get({id: $routeParams.id});

    $scope.deleteEvent = function(event) {
        event.$remove().then(function() {
            $location.path('/events');
        });
    };

    $scope.showEvent = function(event) {
        $location.path('/events/' + event.id);
    };
});

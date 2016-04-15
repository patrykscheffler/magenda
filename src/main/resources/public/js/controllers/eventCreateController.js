angular.module('MeetingsAgenda').controller('EventsCreateController', function($scope, Event, $location) {
    $scope.event = new Event();
    $scope.isSubmitting = false;

    $scope.saveEvent = function(event) {
        $scope.isSubmitting = true;
        $scope.event.eventtime += ":00";
        $scope.event.$save().then(function() {
            $location.path('/events');
        }).finally(function() {
            $scope.isSubmitting = false;
            $scope.event.eventtime = "";
        });
    };
});
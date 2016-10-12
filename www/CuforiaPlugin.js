var exec = require('cordova/exec');

var CuforiaPlugin = {
    start: function() {
        exec(null, null, "CuforiaPlugin", "startVuforia", []);
    }
};

module.exports = CuforiaPlugin;

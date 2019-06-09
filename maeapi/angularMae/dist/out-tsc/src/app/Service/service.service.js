import * as tslib_1 from "tslib";
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
let ServiceService = class ServiceService {
    constructor(http) {
        this.http = http;
        this.Url = 'http://localhost:8080/mae';
        this.UrlAdd = 'http://localhost:8080/mae/add';
    }
    getMaes() {
        return this.http.get(this.Url);
    }
    createMae(mae) {
        return this.http.post(this.UrlAdd, mae);
    }
};
ServiceService = tslib_1.__decorate([
    Injectable({
        providedIn: 'root'
    }),
    tslib_1.__metadata("design:paramtypes", [HttpClient])
], ServiceService);
export { ServiceService };
//# sourceMappingURL=service.service.js.map
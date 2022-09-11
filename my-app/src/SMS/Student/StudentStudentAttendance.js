import React from "react";
import { Outlet, Link } from "react-router-dom";

function StudentStudentAttendance() {
  return (
    <body>
      {/* <!-- Preloader Start Here --> */}
      <div id="preloader"></div>
      {/* <!-- Preloader End Here --> */}
      <div id="wrapper" className="wrapper bg-ash">
        {/* <!-- Header Menu Area Start Here --> */}
        <div className="navbar navbar-expand-md header-menu-one bg-light">
          <div className="navbar-head">
            <div className="header-logo"></div>
            <div className="toggle-button sidebar-toggle"></div>
          </div>
          <div className="d-md-none mobile-nav-bar">
            <button
              className="navbar-toggler pulse-animation"
              type="button"
              data-toggle="collapse"
              data-target="mobile-navbar"
              aria-expanded="false"
            >
              <i className="far fa-arrow-alt-circle-down"></i>
            </button>
            <button
              type="button"
              className="navbar-toggler sidebar-toggle-mobile"
            >
              <i className="fas fa-bars"></i>
            </button>
          </div>
          <div
            className="header-main-menu collapse navbar-collapse"
            id="mobile-navbar"
          >
            <ul className="navbar-nav"></ul>
            <ul className="navbar-nav"></ul>
          </div>
        </div>
        {/* <!-- Header Menu Area End Here -->
        <!-- Page Area Start Here --> */}
        <div className="dashboard-page-one">
          {/* <!-- Sidebar Area Start Here --> */}
          <div className="sidebar-main sidebar-menu-one sidebar-expand-md sidebar-color">
            <div className="mobile-sidebar-header d-md-none">
              <div className="header-logo">
                <Link to="/">
                  <img src="img/logo1.png" alt="logo" />
                </Link>
              </div>
            </div>
            <div className="sidebar-menu-content">
              <ul className="nav nav-sidebar-menu sidebar-toggle-view">
                <li className="nav-item sidebar-nav-item">
                  <Link to="" className="nav-link">
                    <i className="flaticon-classmates"></i>
                    <span>Students</span>
                  </Link>
                  <ul className="nav sub-group-menu sub-group-active">
                    <li className="nav-item">
                      <Link to="/student-student-details" className="nav-link">
                        <i className=""></i>Students Detials
                      </Link>
                    </li>

                    
                  </ul>
                </li>
                

         

                <li className="nav-item">
                  <Link to="/student-index" className="nav-link">
                    <i className="flaticon-open-book"></i>
                    <span>Subject</span>
                  </Link>
                </li>
           
                <li className="nav-item">
                  <Link
                    to="/student-student-attendance"
                    className="nav-link menu-active"
                  >
                    <i className="flaticon-checklist"></i>
                    <span>Attendence</span>
                  </Link>
                </li>

        
              </ul>
            </div>
          </div>
          {/* <!-- Sidebar Area End Here --> */}
          <div className="dashboard-content-one">
            {/* <!-- Breadcubs Area Start Here --> */}
            <div className="breadcrumbs-area">
              <h3>Student Attendence</h3>
              <ul></ul>
            </div>
            {/* <!-- Breadcubs Area End Here --> */}
            <div className="row">
              {/* <!-- Student Attendence Search Area Start Here --> */}
              <div className="col-12">
                <div className="card">
                  <div className="card-body">
                    <div className="heading-layout1">
                      <div className="item-title">
                        <h3>Student Attendence</h3>
                      </div>
                    </div>
                    <form className="new-added-form">
                      <div className="row">
                        <div className="col-xl-3 col-lg-6 col-12 form-group">
                          <label>Select Class</label>
                          <select className="select2">
                            <option value="">Select Class</option>
                            <option value="1">Nursery</option>
                            <option value="2">Play</option>
                            <option value="3">One</option>
                            <option value="4">Two</option>
                            <option value="5">Three</option>
                          </select>
                        </div>
                        <div className="col-xl-3 col-lg-6 col-12 form-group">
                          <label>Select Section</label>
                          <select className="select2">
                            <option value="0">Select Section</option>
                            <option value="1">A</option>
                            <option value="2">B</option>
                            <option value="3">C</option>
                            <option value="4">D</option>
                          </select>
                        </div>
                        <div className="col-xl-3 col-lg-6 col-12 form-group">
                          <label>Select Month</label>
                          <select className="select2">
                            <option value="0">Select Month</option>
                            <option value="1">January</option>
                            <option value="2">February</option>
                            <option value="3">March</option>
                            <option value="4">April</option>
                            <option value="5">May</option>
                            <option value="6">June</option>
                            <option value="7">July</option>
                            <option value="8">August</option>
                            <option value="9">September</option>
                            <option value="10">October</option>
                            <option value="11">November</option>
                            <option value="12">December</option>
                          </select>
                        </div>
                       
                        <div className="col-12 form-group mg-t-8">
                          <button
                            type="submit"
                            className="btn-fill-lg btn-gradient-yellow btn-hover-bluedark"
                          >
                            Search
						
                          </button>
                        </div>
                      </div>
                    </form>
                  </div>
                </div>
              </div>

              <div className="col-12">
                <div className="card">
                  <div className="card-body">
                    <div className="heading-layout1">
                      <div className="item-title">
                        <h3>Attendence Sheet Of Class One: </h3>
                      </div>
                    </div>
                    <div className="table-responsive">
                      <table className="table bs-table table-striped table-bordered text-nowrap">
                        <thead>
                          <tr>
                            <th className="text-left">Students</th>
                            <th>1</th>
                            <th>2</th>
                            <th>3</th>
                            <th>4</th>
                            <th>5</th>
                            <th>6</th>
                            <th>7</th>
                            <th>8</th>
                            <th>9</th>
                            <th>10</th>
                            <th>11</th>
                            <th>12</th>
                            <th>13</th>
                            <th>14</th>
                            <th>15</th>
                            <th>16</th>
                            <th>17</th>
                            <th>18</th>
                            <th>19</th>
                            <th>20</th>
                            <th>21</th>
                            <th>22</th>
                            <th>23</th>
                            <th>24</th>
                            <th>25</th>
                            <th>26</th>
                            <th>27</th>
                            <th>28</th>
                            <th>29</th>
                            <th>30</th>
                            <th>31</th>
                          </tr>
                        </thead>
                        <tbody></tbody>
                      </table>
                    </div>
                  </div>
                </div>
              </div>
            </div>

            <footer className="footer-wrap-layout1"></footer>
          </div>
        </div>
      </div>
    </body>
  );
}

export default StudentStudentAttendance;
